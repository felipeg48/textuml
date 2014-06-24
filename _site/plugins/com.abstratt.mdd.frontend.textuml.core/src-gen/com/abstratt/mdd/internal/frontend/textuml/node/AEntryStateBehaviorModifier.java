/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AEntryStateBehaviorModifier extends PStateBehaviorModifier
{
    private TEntry _entry_;

    public AEntryStateBehaviorModifier()
    {
        // Constructor
    }

    public AEntryStateBehaviorModifier(
        @SuppressWarnings("hiding") TEntry _entry_)
    {
        // Constructor
        setEntry(_entry_);

    }

    @Override
    public Object clone()
    {
        return new AEntryStateBehaviorModifier(
            cloneNode(this._entry_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEntryStateBehaviorModifier(this);
    }

    public TEntry getEntry()
    {
        return this._entry_;
    }

    public void setEntry(TEntry node)
    {
        if(this._entry_ != null)
        {
            this._entry_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._entry_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._entry_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._entry_ == child)
        {
            this._entry_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._entry_ == oldChild)
        {
            setEntry((TEntry) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}