/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AOptionalBehavioralFeatureBody extends POptionalBehavioralFeatureBody
{
    private PBehavioralFeatureBody _behavioralFeatureBody_;

    public AOptionalBehavioralFeatureBody()
    {
        // Constructor
    }

    public AOptionalBehavioralFeatureBody(
        @SuppressWarnings("hiding") PBehavioralFeatureBody _behavioralFeatureBody_)
    {
        // Constructor
        setBehavioralFeatureBody(_behavioralFeatureBody_);

    }

    @Override
    public Object clone()
    {
        return new AOptionalBehavioralFeatureBody(
            cloneNode(this._behavioralFeatureBody_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOptionalBehavioralFeatureBody(this);
    }

    public PBehavioralFeatureBody getBehavioralFeatureBody()
    {
        return this._behavioralFeatureBody_;
    }

    public void setBehavioralFeatureBody(PBehavioralFeatureBody node)
    {
        if(this._behavioralFeatureBody_ != null)
        {
            this._behavioralFeatureBody_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._behavioralFeatureBody_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._behavioralFeatureBody_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._behavioralFeatureBody_ == child)
        {
            this._behavioralFeatureBody_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._behavioralFeatureBody_ == oldChild)
        {
            setBehavioralFeatureBody((PBehavioralFeatureBody) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
