/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class TUri extends Token
{
    public TUri(String text)
    {
        setText(text);
    }

    public TUri(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TUri(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTUri(this);
    }
}
