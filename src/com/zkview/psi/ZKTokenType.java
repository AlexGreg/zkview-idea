package com.zkview.psi;

import com.intellij.psi.tree.IElementType;
import com.zkview.ZKLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class ZKTokenType extends IElementType {

    public ZKTokenType(@NotNull @NonNls String debugName) {
        super(debugName, ZKLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "ZKTokenType."+ super.toString();
    }
}
