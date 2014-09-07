/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AStatement extends PStatement
{
    private PStatementResolved _statementResolved_;
    private TSemicolon _semicolon_;

    public AStatement()
    {
        // Constructor
    }

    public AStatement(
        @SuppressWarnings("hiding") PStatementResolved _statementResolved_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setStatementResolved(_statementResolved_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new AStatement(
            cloneNode(this._statementResolved_),
            cloneNode(this._semicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStatement(this);
    }

    public PStatementResolved getStatementResolved()
    {
        return this._statementResolved_;
    }

    public void setStatementResolved(PStatementResolved node)
    {
        if(this._statementResolved_ != null)
        {
            this._statementResolved_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._statementResolved_ = node;
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
            + toString(this._statementResolved_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._statementResolved_ == child)
        {
            this._statementResolved_ = null;
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
        if(this._statementResolved_ == oldChild)
        {
            setStatementResolved((PStatementResolved) newChild);
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
