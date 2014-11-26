// This is a generated file. Not intended for manual editing.
package com.zkview.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.zkview.psi.impl.*;

public interface ZKTypes {

  IElementType PROPERTY = new ZKElementType("PROPERTY");

  IElementType COMMENT = new ZKTokenType("COMMENT");
  IElementType CRLF = new ZKTokenType("CRLF");
  IElementType KEY = new ZKTokenType("KEY");
  IElementType SEPARATOR = new ZKTokenType("SEPARATOR");
  IElementType VALUE = new ZKTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == PROPERTY) {
        return new ZKPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
