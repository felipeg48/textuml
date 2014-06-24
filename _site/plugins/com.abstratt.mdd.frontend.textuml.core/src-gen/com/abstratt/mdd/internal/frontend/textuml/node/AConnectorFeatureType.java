/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AConnectorFeatureType extends PFeatureType
{
    private PConnectorDecl _connectorDecl_;

    public AConnectorFeatureType()
    {
        // Constructor
    }

    public AConnectorFeatureType(
        @SuppressWarnings("hiding") PConnectorDecl _connectorDecl_)
    {
        // Constructor
        setConnectorDecl(_connectorDecl_);

    }

    @Override
    public Object clone()
    {
        return new AConnectorFeatureType(
            cloneNode(this._connectorDecl_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAConnectorFeatureType(this);
    }

    public PConnectorDecl getConnectorDecl()
    {
        return this._connectorDecl_;
    }

    public void setConnectorDecl(PConnectorDecl node)
    {
        if(this._connectorDecl_ != null)
        {
            this._connectorDecl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._connectorDecl_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._connectorDecl_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._connectorDecl_ == child)
        {
            this._connectorDecl_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._connectorDecl_ == oldChild)
        {
            setConnectorDecl((PConnectorDecl) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
