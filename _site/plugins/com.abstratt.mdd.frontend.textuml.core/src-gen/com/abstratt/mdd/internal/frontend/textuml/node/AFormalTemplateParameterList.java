/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import java.util.*;
import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AFormalTemplateParameterList extends PFormalTemplateParameterList
{
    private PFormalTemplateParameter _formalTemplateParameter_;
    private final LinkedList<PFormalTemplateParameterTail> _formalTemplateParameterTail_ = new LinkedList<PFormalTemplateParameterTail>();

    public AFormalTemplateParameterList()
    {
        // Constructor
    }

    public AFormalTemplateParameterList(
        @SuppressWarnings("hiding") PFormalTemplateParameter _formalTemplateParameter_,
        @SuppressWarnings("hiding") List<PFormalTemplateParameterTail> _formalTemplateParameterTail_)
    {
        // Constructor
        setFormalTemplateParameter(_formalTemplateParameter_);

        setFormalTemplateParameterTail(_formalTemplateParameterTail_);

    }

    @Override
    public Object clone()
    {
        return new AFormalTemplateParameterList(
            cloneNode(this._formalTemplateParameter_),
            cloneList(this._formalTemplateParameterTail_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFormalTemplateParameterList(this);
    }

    public PFormalTemplateParameter getFormalTemplateParameter()
    {
        return this._formalTemplateParameter_;
    }

    public void setFormalTemplateParameter(PFormalTemplateParameter node)
    {
        if(this._formalTemplateParameter_ != null)
        {
            this._formalTemplateParameter_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._formalTemplateParameter_ = node;
    }

    public LinkedList<PFormalTemplateParameterTail> getFormalTemplateParameterTail()
    {
        return this._formalTemplateParameterTail_;
    }

    public void setFormalTemplateParameterTail(List<PFormalTemplateParameterTail> list)
    {
        this._formalTemplateParameterTail_.clear();
        this._formalTemplateParameterTail_.addAll(list);
        for(PFormalTemplateParameterTail e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._formalTemplateParameter_)
            + toString(this._formalTemplateParameterTail_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._formalTemplateParameter_ == child)
        {
            this._formalTemplateParameter_ = null;
            return;
        }

        if(this._formalTemplateParameterTail_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._formalTemplateParameter_ == oldChild)
        {
            setFormalTemplateParameter((PFormalTemplateParameter) newChild);
            return;
        }

        for(ListIterator<PFormalTemplateParameterTail> i = this._formalTemplateParameterTail_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PFormalTemplateParameterTail) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
