/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AEmptySimpleParamDeclListTail extends PSimpleParamDeclListTail
{

    public AEmptySimpleParamDeclListTail()
    {
        // Constructor
    }

    @Override
    public Object clone()
    {
        return new AEmptySimpleParamDeclListTail();
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEmptySimpleParamDeclListTail(this);
    }

    @Override
    public String toString()
    {
        return "";
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        throw new RuntimeException("Not a child.");
    }
}
