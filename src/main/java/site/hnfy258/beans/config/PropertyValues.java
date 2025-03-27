package site.hnfy258.beans.config;

import java.util.ArrayList;
import java.util.List;

public class PropertyValues {


        private final List<PropertyValue> propertyValueList = new ArrayList<>();

            //添加属性值
            public void addPropertyValue(PropertyValue propertyValue){
                propertyValueList.add(propertyValue);
            }

            //获得所有属性值（以数组形式）
            public PropertyValue[] getPropertyValues(){
                return propertyValueList.toArray(new PropertyValue[0]);
            }
            //根据属性名获得属性值
            public PropertyValue getPropertyValue(String name){
                for (PropertyValue propertyValue : propertyValueList) {
                    if (propertyValue.getName().equals(name)){
                        return propertyValue;
                    }
                }
                return null;
            }

}
