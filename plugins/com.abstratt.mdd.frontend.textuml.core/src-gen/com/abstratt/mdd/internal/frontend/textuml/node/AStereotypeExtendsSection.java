/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AStereotypeExtendsSection extends PStereotypeExtendsSection
{
    private TExtends _extends_;
    private PStereotypeExtensionList _stereotypeExtensionList_;

    public AStereotypeExtendsSection()
    {
        // Constructor
    }

    public AStereotypeExtendsSection(
        @SuppressWarnings("hiding") TExtends _extends_,
        @SuppressWarnings("hiding") PStereotypeExtensionList _stereotypeExtensionList_)
    {
        // Constructor
        setExtends(_extends_);

        setStereotypeExtensionList(_stereotypeExtensionList_);

    }

    @Override
    public Object clone()
    {
        return new AStereotypeExtendsSection(
            cloneNode(this._extends_),
            cloneNode(this._stereotypeExtensionList_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStereotypeExtendsSection(this);
    }

    public TExtends getExtends()
    {
        return this._extends_;
    }

    public void setExtends(TExtends node)
    {
        if(this._extends_ != null)
        {
            this._extends_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._extends_ = node;
    }

    public PStereotypeExtensionList getStereotypeExtensionList()
    {
        return this._stereotypeExtensionList_;
    }

    public void setStereotypeExtensionList(PStereotypeExtensionList node)
    {
        if(this._stereotypeExtensionList_ != null)
        {
            this._stereotypeExtensionList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._stereotypeExtensionList_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._extends_)
            + toString(this._stereotypeExtensionList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._extends_ == child)
        {
            this._extends_ = null;
            return;
        }

        if(this._stereotypeExtensionList_ == child)
        {
            this._stereotypeExtensionList_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._extends_ == oldChild)
        {
            setExtends((TExtends) newChild);
            return;
        }

        if(this._stereotypeExtensionList_ == oldChild)
        {
            setStereotypeExtensionList((PStereotypeExtensionList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
