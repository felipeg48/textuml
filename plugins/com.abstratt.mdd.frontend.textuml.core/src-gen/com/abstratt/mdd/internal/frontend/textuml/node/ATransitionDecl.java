/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class ATransitionDecl extends PTransitionDecl
{
    private TModelComment _modelComment_;
    private TTransition _transition_;
    private PTransitionTriggers _transitionTriggers_;
    private TTo _to_;
    private TIdentifier _destination_;
    private PTransitionGuard _transitionGuard_;
    private PTransitionEffect _transitionEffect_;
    private TSemicolon _semicolon_;

    public ATransitionDecl()
    {
        // Constructor
    }

    public ATransitionDecl(
        @SuppressWarnings("hiding") TModelComment _modelComment_,
        @SuppressWarnings("hiding") TTransition _transition_,
        @SuppressWarnings("hiding") PTransitionTriggers _transitionTriggers_,
        @SuppressWarnings("hiding") TTo _to_,
        @SuppressWarnings("hiding") TIdentifier _destination_,
        @SuppressWarnings("hiding") PTransitionGuard _transitionGuard_,
        @SuppressWarnings("hiding") PTransitionEffect _transitionEffect_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setModelComment(_modelComment_);

        setTransition(_transition_);

        setTransitionTriggers(_transitionTriggers_);

        setTo(_to_);

        setDestination(_destination_);

        setTransitionGuard(_transitionGuard_);

        setTransitionEffect(_transitionEffect_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new ATransitionDecl(
            cloneNode(this._modelComment_),
            cloneNode(this._transition_),
            cloneNode(this._transitionTriggers_),
            cloneNode(this._to_),
            cloneNode(this._destination_),
            cloneNode(this._transitionGuard_),
            cloneNode(this._transitionEffect_),
            cloneNode(this._semicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATransitionDecl(this);
    }

    public TModelComment getModelComment()
    {
        return this._modelComment_;
    }

    public void setModelComment(TModelComment node)
    {
        if(this._modelComment_ != null)
        {
            this._modelComment_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._modelComment_ = node;
    }

    public TTransition getTransition()
    {
        return this._transition_;
    }

    public void setTransition(TTransition node)
    {
        if(this._transition_ != null)
        {
            this._transition_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._transition_ = node;
    }

    public PTransitionTriggers getTransitionTriggers()
    {
        return this._transitionTriggers_;
    }

    public void setTransitionTriggers(PTransitionTriggers node)
    {
        if(this._transitionTriggers_ != null)
        {
            this._transitionTriggers_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._transitionTriggers_ = node;
    }

    public TTo getTo()
    {
        return this._to_;
    }

    public void setTo(TTo node)
    {
        if(this._to_ != null)
        {
            this._to_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._to_ = node;
    }

    public TIdentifier getDestination()
    {
        return this._destination_;
    }

    public void setDestination(TIdentifier node)
    {
        if(this._destination_ != null)
        {
            this._destination_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._destination_ = node;
    }

    public PTransitionGuard getTransitionGuard()
    {
        return this._transitionGuard_;
    }

    public void setTransitionGuard(PTransitionGuard node)
    {
        if(this._transitionGuard_ != null)
        {
            this._transitionGuard_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._transitionGuard_ = node;
    }

    public PTransitionEffect getTransitionEffect()
    {
        return this._transitionEffect_;
    }

    public void setTransitionEffect(PTransitionEffect node)
    {
        if(this._transitionEffect_ != null)
        {
            this._transitionEffect_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._transitionEffect_ = node;
    }

    public TSemicolon getSemicolon()
    {
        return this._semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(this._semicolon_ != null)
        {
            this._semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semicolon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._modelComment_)
            + toString(this._transition_)
            + toString(this._transitionTriggers_)
            + toString(this._to_)
            + toString(this._destination_)
            + toString(this._transitionGuard_)
            + toString(this._transitionEffect_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._modelComment_ == child)
        {
            this._modelComment_ = null;
            return;
        }

        if(this._transition_ == child)
        {
            this._transition_ = null;
            return;
        }

        if(this._transitionTriggers_ == child)
        {
            this._transitionTriggers_ = null;
            return;
        }

        if(this._to_ == child)
        {
            this._to_ = null;
            return;
        }

        if(this._destination_ == child)
        {
            this._destination_ = null;
            return;
        }

        if(this._transitionGuard_ == child)
        {
            this._transitionGuard_ = null;
            return;
        }

        if(this._transitionEffect_ == child)
        {
            this._transitionEffect_ = null;
            return;
        }

        if(this._semicolon_ == child)
        {
            this._semicolon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._modelComment_ == oldChild)
        {
            setModelComment((TModelComment) newChild);
            return;
        }

        if(this._transition_ == oldChild)
        {
            setTransition((TTransition) newChild);
            return;
        }

        if(this._transitionTriggers_ == oldChild)
        {
            setTransitionTriggers((PTransitionTriggers) newChild);
            return;
        }

        if(this._to_ == oldChild)
        {
            setTo((TTo) newChild);
            return;
        }

        if(this._destination_ == oldChild)
        {
            setDestination((TIdentifier) newChild);
            return;
        }

        if(this._transitionGuard_ == oldChild)
        {
            setTransitionGuard((PTransitionGuard) newChild);
            return;
        }

        if(this._transitionEffect_ == oldChild)
        {
            setTransitionEffect((PTransitionEffect) newChild);
            return;
        }

        if(this._semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
