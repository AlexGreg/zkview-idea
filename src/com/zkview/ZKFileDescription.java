package com.zkview;

import com.intellij.psi.xml.XmlFile;
import com.intellij.util.xml.DomFileDescription;
import com.zkview.dom.Zk;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Created by alex on 26/11/14.
 */
public class ZKFileDescription extends DomFileDescription<Zk>{


    public ZKFileDescription() {
        super(Zk.class, "zk");
    }

    @Override
    public String[] getAllPossibleRootTagNamespaces() {
        return super.getAllPossibleRootTagNamespaces();
    }

    @NotNull
    @Override
    public List<String> getAllowedNamespaces(@NotNull String namespaceKey, @NotNull XmlFile file) {
        return super.getAllowedNamespaces(namespaceKey, file);
    }
}
