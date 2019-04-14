package com.epam.factory;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

public interface Voice {
    @Getter
    String getLanguage();
    @Setter
    void setLanguage(String language);
}
