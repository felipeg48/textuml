/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class AAlt0ExpressionP1 extends PExpressionP1
{
    private TMinus _operator_;
    private PExpressionP1 _operand_;

    public AAlt0ExpressionP1()
    {
        // Constructor
    }

    public AAlt0ExpressionP1(
        @SuppressWarnings("hiding") TMinus _operator_,
        @SuppressWarnings("hiding") PExpressionP1 _operand_)
    {
        // Constructor
        setOperator(_operator_);

        setOperand(_operand_);

    }

    @Override
    public Object clone()
    {
        return new AAlt0ExpressionP1(
            cloneNode(this._operator_),
            cloneNode(this._operand_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAlt0ExpressionP1(this);
    }

    public TMinus getOperator()
    {
        return this._operator_;
    }

    public void setOperator(TMinus node)
    {
        if(this._operator_ != null)
        {
            this._operator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._operator_ = node;
    }

    public PExpressionP1 getOperand()
    {
        return this._operand_;
    }

    public void setOperand(PExpressionP1 node)
    {
        if(this._operand_ != null)
        {
            this._operand_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._operand_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._operator_)
            + toString(this._operand_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._operator_ == child)
        {
            this._operator_ = null;
            return;
        }

        if(this._operand_ == child)
        {
            this._operand_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._operator_ == oldChild)
        {
            setOperator((TMinus) newChild);
            return;
        }

        if(this._operand_ == oldChild)
        {
            setOperand((PExpressionP1) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
