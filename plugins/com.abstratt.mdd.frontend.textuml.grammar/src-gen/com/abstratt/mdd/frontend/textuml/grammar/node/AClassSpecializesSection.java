/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class AClassSpecializesSection extends PClassSpecializesSection
{
    private TSpecializes _specializes_;
    private PClassSpecializesList _classSpecializesList_;

    public AClassSpecializesSection()
    {
        // Constructor
    }

    public AClassSpecializesSection(
        @SuppressWarnings("hiding") TSpecializes _specializes_,
        @SuppressWarnings("hiding") PClassSpecializesList _classSpecializesList_)
    {
        // Constructor
        setSpecializes(_specializes_);

        setClassSpecializesList(_classSpecializesList_);

    }

    @Override
    public Object clone()
    {
        return new AClassSpecializesSection(
            cloneNode(this._specializes_),
            cloneNode(this._classSpecializesList_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAClassSpecializesSection(this);
    }

    public TSpecializes getSpecializes()
    {
        return this._specializes_;
    }

    public void setSpecializes(TSpecializes node)
    {
        if(this._specializes_ != null)
        {
            this._specializes_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._specializes_ = node;
    }

    public PClassSpecializesList getClassSpecializesList()
    {
        return this._classSpecializesList_;
    }

    public void setClassSpecializesList(PClassSpecializesList node)
    {
        if(this._classSpecializesList_ != null)
        {
            this._classSpecializesList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._classSpecializesList_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._specializes_)
            + toString(this._classSpecializesList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._specializes_ == child)
        {
            this._specializes_ = null;
            return;
        }

        if(this._classSpecializesList_ == child)
        {
            this._classSpecializesList_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._specializes_ == oldChild)
        {
            setSpecializes((TSpecializes) newChild);
            return;
        }

        if(this._classSpecializesList_ == oldChild)
        {
            setClassSpecializesList((PClassSpecializesList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
