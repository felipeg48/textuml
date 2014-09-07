/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class ARepeatLoopStatement extends PLoopStatement
{
    private PRepeatStatement _repeatStatement_;

    public ARepeatLoopStatement()
    {
        // Constructor
    }

    public ARepeatLoopStatement(
        @SuppressWarnings("hiding") PRepeatStatement _repeatStatement_)
    {
        // Constructor
        setRepeatStatement(_repeatStatement_);

    }

    @Override
    public Object clone()
    {
        return new ARepeatLoopStatement(
            cloneNode(this._repeatStatement_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARepeatLoopStatement(this);
    }

    public PRepeatStatement getRepeatStatement()
    {
        return this._repeatStatement_;
    }

    public void setRepeatStatement(PRepeatStatement node)
    {
        if(this._repeatStatement_ != null)
        {
            this._repeatStatement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._repeatStatement_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._repeatStatement_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._repeatStatement_ == child)
        {
            this._repeatStatement_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._repeatStatement_ == oldChild)
        {
            setRepeatStatement((PRepeatStatement) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
