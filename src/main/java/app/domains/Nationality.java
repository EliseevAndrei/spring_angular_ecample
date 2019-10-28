package app.domains;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


public enum Nationality {
    BELARUS("Беларус"),
    RUSSIAN("Россиянин"),
    UKRAIN("Украинец"),
    KAZAHSTAN("Казах");

    private String value;

    Nationality(String value){
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
