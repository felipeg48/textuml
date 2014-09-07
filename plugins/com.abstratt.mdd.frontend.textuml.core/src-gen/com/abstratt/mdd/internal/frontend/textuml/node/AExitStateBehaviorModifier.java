/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AExitStateBehaviorModifier extends PStateBehaviorModifier
{
    private TExit _exit_;

    public AExitStateBehaviorModifier()
    {
        // Constructor
    }

    public AExitStateBehaviorModifier(
        @SuppressWarnings("hiding") TExit _exit_)
    {
        // Constructor
        setExit(_exit_);

    }

    @Override
    public Object clone()
    {
        return new AExitStateBehaviorModifier(
            cloneNode(this._exit_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExitStateBehaviorModifier(this);
    }

    public TExit getExit()
    {
        return this._exit_;
    }

    public void setExit(TExit node)
    {
        if(this._exit_ != null)
        {
            this._exit_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exit_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exit_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exit_ == child)
        {
            this._exit_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exit_ == oldChild)
        {
            setExit((TExit) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
