/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AStateBehavior extends PStateBehavior
{
    private PStateBehaviorModifier _stateBehaviorModifier_;
    private PStateBehaviorDefinition _stateBehaviorDefinition_;
    private TSemicolon _semicolon_;

    public AStateBehavior()
    {
        // Constructor
    }

    public AStateBehavior(
        @SuppressWarnings("hiding") PStateBehaviorModifier _stateBehaviorModifier_,
        @SuppressWarnings("hiding") PStateBehaviorDefinition _stateBehaviorDefinition_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setStateBehaviorModifier(_stateBehaviorModifier_);

        setStateBehaviorDefinition(_stateBehaviorDefinition_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new AStateBehavior(
            cloneNode(this._stateBehaviorModifier_),
            cloneNode(this._stateBehaviorDefinition_),
            cloneNode(this._semicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStateBehavior(this);
    }

    public PStateBehaviorModifier getStateBehaviorModifier()
    {
        return this._stateBehaviorModifier_;
    }

    public void setStateBehaviorModifier(PStateBehaviorModifier node)
    {
        if(this._stateBehaviorModifier_ != null)
        {
            this._stateBehaviorModifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._stateBehaviorModifier_ = node;
    }

    public PStateBehaviorDefinition getStateBehaviorDefinition()
    {
        return this._stateBehaviorDefinition_;
    }

    public void setStateBehaviorDefinition(PStateBehaviorDefinition node)
    {
        if(this._stateBehaviorDefinition_ != null)
        {
            this._stateBehaviorDefinition_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._stateBehaviorDefinition_ = node;
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
            + toString(this._stateBehaviorModifier_)
            + toString(this._stateBehaviorDefinition_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._stateBehaviorModifier_ == child)
        {
            this._stateBehaviorModifier_ = null;
            return;
        }

        if(this._stateBehaviorDefinition_ == child)
        {
            this._stateBehaviorDefinition_ = null;
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
        if(this._stateBehaviorModifier_ == oldChild)
        {
            setStateBehaviorModifier((PStateBehaviorModifier) newChild);
            return;
        }

        if(this._stateBehaviorDefinition_ == oldChild)
        {
            setStateBehaviorDefinition((PStateBehaviorDefinition) newChild);
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
