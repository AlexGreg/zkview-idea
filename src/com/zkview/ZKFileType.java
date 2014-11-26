package com.zkview;

import com.intellij.lang.xml.XMLLanguage;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ZKFileType extends LanguageFileType {

    public static final ZKFileType INSTANCE = new ZKFileType();

    protected ZKFileType() {
        super(XMLLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "ZK file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "ZK file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "zul";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return ZKIcons.FILE;
    }
}
