package com.zkview;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.FlexLexer;

import java.io.Reader;

public class ZkLexerAdapter extends FlexAdapter {

    public ZkLexerAdapter(FlexLexer flex) {
        super(new ZKLexer((Reader) null));
    }
}
