/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class ATransitionTriggers extends PTransitionTriggers
{
    private TOn _on_;
    private PTransitionTrigger _transitionTrigger_;
    private PTransitionTriggerTail _transitionTriggerTail_;

    public ATransitionTriggers()
    {
        // Constructor
    }

    public ATransitionTriggers(
        @SuppressWarnings("hiding") TOn _on_,
        @SuppressWarnings("hiding") PTransitionTrigger _transitionTrigger_,
        @SuppressWarnings("hiding") PTransitionTriggerTail _transitionTriggerTail_)
    {
        // Constructor
        setOn(_on_);

        setTransitionTrigger(_transitionTrigger_);

        setTransitionTriggerTail(_transitionTriggerTail_);

    }

    @Override
    public Object clone()
    {
        return new ATransitionTriggers(
            cloneNode(this._on_),
            cloneNode(this._transitionTrigger_),
            cloneNode(this._transitionTriggerTail_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATransitionTriggers(this);
    }

    public TOn getOn()
    {
        return this._on_;
    }

    public void setOn(TOn node)
    {
        if(this._on_ != null)
        {
            this._on_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._on_ = node;
    }

    public PTransitionTrigger getTransitionTrigger()
    {
        return this._transitionTrigger_;
    }

    public void setTransitionTrigger(PTransitionTrigger node)
    {
        if(this._transitionTrigger_ != null)
        {
            this._transitionTrigger_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._transitionTrigger_ = node;
    }

    public PTransitionTriggerTail getTransitionTriggerTail()
    {
        return this._transitionTriggerTail_;
    }

    public void setTransitionTriggerTail(PTransitionTriggerTail node)
    {
        if(this._transitionTriggerTail_ != null)
        {
            this._transitionTriggerTail_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._transitionTriggerTail_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._on_)
            + toString(this._transitionTrigger_)
            + toString(this._transitionTriggerTail_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._on_ == child)
        {
            this._on_ = null;
            return;
        }

        if(this._transitionTrigger_ == child)
        {
            this._transitionTrigger_ = null;
            return;
        }

        if(this._transitionTriggerTail_ == child)
        {
            this._transitionTriggerTail_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._on_ == oldChild)
        {
            setOn((TOn) newChild);
            return;
        }

        if(this._transitionTrigger_ == oldChild)
        {
            setTransitionTrigger((PTransitionTrigger) newChild);
            return;
        }

        if(this._transitionTriggerTail_ == oldChild)
        {
            setTransitionTriggerTail((PTransitionTriggerTail) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
