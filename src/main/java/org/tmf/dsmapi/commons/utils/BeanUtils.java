/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tmf.dsmapi.commons.utils;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.beanutils.PropertyUtilsBean;

/**
 *
 * @author maig7313
 */
public class BeanUtils {

    private static final PropertyUtilsBean PUB = new PropertyUtilsBean();

    /**
     *
     * @param bean
     * @param name
     * @return
     */
    public static Object getNestedProperty(Object bean, String name) {
        try {
            return PUB.getNestedProperty(bean, name);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     *
     * @param bean
     * @param name
     * @param value
     */
    public static void setNestedProperty(Object bean, String name, Object value) {
        try {
            PUB.setNestedProperty(bean, name, value);
        } catch (Exception ex) {
        }
    }

    /**
     *
     * @param bean
     * @param patchBean
     * @param node
     */
    public static boolean patch(Object currentBean, Object patchBean, JsonNode node) {
        String name;
        JsonNode childNode;
        Object value;
        Object patchValue;
        Iterator<String> it = node.fieldNames();
        boolean isModified = false;
        while (it.hasNext()) {
            name = it.next();
            patchValue = BeanUtils.getNestedProperty(patchBean, name);
            childNode = node.get(name);
            if (null != patchValue) {
                if (childNode.isArray() && !childNode.isNull()) {
                    //for (final JsonNode nodeArray : childNode) {
                    for (int i=0; i<childNode.size();i++) {
                        value = BeanUtils.getNestedProperty(currentBean, name);
                        patch(value, patchValue, childNode);
                        BeanUtils.setNestedProperty(currentBean, name, patchValue);
                        isModified = true;
                    }
                } else {
                    value = BeanUtils.getNestedProperty(currentBean, name);
                    patch(value, patchValue, childNode);
                    BeanUtils.setNestedProperty(currentBean, name, patchValue);
                    isModified = true;
                }
            }
        }
        return isModified;
    }

    public static List<String> getNodesName(JsonNode node, Object patchBean, String beanName, List<String> l_resourceName) {
        boolean find = false;
        String resourceName;
        JsonNode childNode;
        Iterator<Map.Entry<String, JsonNode>> itMap = node.fields();
        while (itMap.hasNext() && !find) {
            Map.Entry entry = (Map.Entry) itMap.next();
            resourceName = beanName.concat(".").concat((String) entry.getKey());
            childNode = (JsonNode) entry.getValue();
            l_resourceName.add(resourceName);
            if (childNode.isArray() && !childNode.isNull()) {
                for (final JsonNode nodeArray : childNode) {
                    getNodesName(nodeArray, patchBean, resourceName, l_resourceName);
                }
            } else {
                if (childNode.isObject() && !childNode.isNull()) {
                    getNodesName(childNode, patchBean, resourceName, l_resourceName);

                }
            }
//            Logger.getLogger("VERIFY").log(Level.INFO, "KEY : " + entry.getKey());
//            Logger.getLogger("VERIFY").log(Level.INFO, "VALUE : " + entry.getValue());
        }
        return l_resourceName;
    }

}
