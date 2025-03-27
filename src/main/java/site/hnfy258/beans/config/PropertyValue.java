package site.hnfy258.beans.config;

public class PropertyValue {

    //使用final保证线程安全
        private final String name;
        private final String value;

            public PropertyValue(String name, String value) {
                this.name = name;
                this.value = value;
            }

            public String getName() {
                return name;
            }
            public String getValue() {
                return value;
            }
}
