/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class TSignal extends Token
{
    public TSignal()
    {
        super.setText("signal");
    }

    public TSignal(int line, int pos)
    {
        super.setText("signal");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TSignal(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSignal(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TSignal text.");
    }
}
