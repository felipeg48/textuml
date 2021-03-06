/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class AAnnotation extends PAnnotation
{
    private PQualifiedIdentifier _qualifiedIdentifier_;
    private PAnnotationOptionalValueSpecs _annotationOptionalValueSpecs_;

    public AAnnotation()
    {
        // Constructor
    }

    public AAnnotation(
        @SuppressWarnings("hiding") PQualifiedIdentifier _qualifiedIdentifier_,
        @SuppressWarnings("hiding") PAnnotationOptionalValueSpecs _annotationOptionalValueSpecs_)
    {
        // Constructor
        setQualifiedIdentifier(_qualifiedIdentifier_);

        setAnnotationOptionalValueSpecs(_annotationOptionalValueSpecs_);

    }

    @Override
    public Object clone()
    {
        return new AAnnotation(
            cloneNode(this._qualifiedIdentifier_),
            cloneNode(this._annotationOptionalValueSpecs_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAnnotation(this);
    }

    public PQualifiedIdentifier getQualifiedIdentifier()
    {
        return this._qualifiedIdentifier_;
    }

    public void setQualifiedIdentifier(PQualifiedIdentifier node)
    {
        if(this._qualifiedIdentifier_ != null)
        {
            this._qualifiedIdentifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._qualifiedIdentifier_ = node;
    }

    public PAnnotationOptionalValueSpecs getAnnotationOptionalValueSpecs()
    {
        return this._annotationOptionalValueSpecs_;
    }

    public void setAnnotationOptionalValueSpecs(PAnnotationOptionalValueSpecs node)
    {
        if(this._annotationOptionalValueSpecs_ != null)
        {
            this._annotationOptionalValueSpecs_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._annotationOptionalValueSpecs_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._qualifiedIdentifier_)
            + toString(this._annotationOptionalValueSpecs_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._qualifiedIdentifier_ == child)
        {
            this._qualifiedIdentifier_ = null;
            return;
        }

        if(this._annotationOptionalValueSpecs_ == child)
        {
            this._annotationOptionalValueSpecs_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._qualifiedIdentifier_ == oldChild)
        {
            setQualifiedIdentifier((PQualifiedIdentifier) newChild);
            return;
        }

        if(this._annotationOptionalValueSpecs_ == oldChild)
        {
            setAnnotationOptionalValueSpecs((PAnnotationOptionalValueSpecs) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
