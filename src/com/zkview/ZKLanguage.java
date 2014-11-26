package com.zkview;

import com.intellij.lang.Language;

public class ZKLanguage extends Language {

    public static final ZKLanguage INSTANCE = new ZKLanguage();

    protected ZKLanguage() {
        super("ZK");
    }
}
