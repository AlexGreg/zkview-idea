package com.zkview.psi;

import com.intellij.psi.tree.IElementType;
import com.zkview.ZKLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class ZKElementType extends IElementType {

    public ZKElementType(@NotNull @NonNls String debugName) {
        super(debugName, ZKLanguage.INSTANCE);
    }
}
