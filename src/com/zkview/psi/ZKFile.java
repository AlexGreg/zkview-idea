package com.zkview.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.zkview.ZKFileType;
import com.zkview.ZKLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ZKFile extends PsiFileBase{

    public ZKFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, ZKLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return ZKFileType.INSTANCE;
    }

    @Nullable
    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }

    @Override
    public String toString() {
        return "ZK File";
    }
}
