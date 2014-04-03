/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class TDestroy extends Token
{
    public TDestroy()
    {
        super.setText("destroy");
    }

    public TDestroy(int line, int pos)
    {
        super.setText("destroy");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDestroy(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDestroy(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TDestroy text.");
    }
}
