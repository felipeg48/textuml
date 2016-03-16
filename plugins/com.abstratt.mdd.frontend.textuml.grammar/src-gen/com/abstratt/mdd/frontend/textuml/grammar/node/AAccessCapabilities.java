/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import java.util.*;
import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class AAccessCapabilities extends PAccessCapabilities
{
    private TLCurlyBracket _lCurlyBracket_;
    private final LinkedList<PAccessCapability> _accessCapability_ = new LinkedList<PAccessCapability>();
    private TRCurlyBracket _rCurlyBracket_;

    public AAccessCapabilities()
    {
        // Constructor
    }

    public AAccessCapabilities(
        @SuppressWarnings("hiding") TLCurlyBracket _lCurlyBracket_,
        @SuppressWarnings("hiding") List<PAccessCapability> _accessCapability_,
        @SuppressWarnings("hiding") TRCurlyBracket _rCurlyBracket_)
    {
        // Constructor
        setLCurlyBracket(_lCurlyBracket_);

        setAccessCapability(_accessCapability_);

        setRCurlyBracket(_rCurlyBracket_);

    }

    @Override
    public Object clone()
    {
        return new AAccessCapabilities(
            cloneNode(this._lCurlyBracket_),
            cloneList(this._accessCapability_),
            cloneNode(this._rCurlyBracket_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAccessCapabilities(this);
    }

    public TLCurlyBracket getLCurlyBracket()
    {
        return this._lCurlyBracket_;
    }

    public void setLCurlyBracket(TLCurlyBracket node)
    {
        if(this._lCurlyBracket_ != null)
        {
            this._lCurlyBracket_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lCurlyBracket_ = node;
    }

    public LinkedList<PAccessCapability> getAccessCapability()
    {
        return this._accessCapability_;
    }

    public void setAccessCapability(List<PAccessCapability> list)
    {
        this._accessCapability_.clear();
        this._accessCapability_.addAll(list);
        for(PAccessCapability e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public TRCurlyBracket getRCurlyBracket()
    {
        return this._rCurlyBracket_;
    }

    public void setRCurlyBracket(TRCurlyBracket node)
    {
        if(this._rCurlyBracket_ != null)
        {
            this._rCurlyBracket_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rCurlyBracket_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lCurlyBracket_)
            + toString(this._accessCapability_)
            + toString(this._rCurlyBracket_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lCurlyBracket_ == child)
        {
            this._lCurlyBracket_ = null;
            return;
        }

        if(this._accessCapability_.remove(child))
        {
            return;
        }

        if(this._rCurlyBracket_ == child)
        {
            this._rCurlyBracket_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lCurlyBracket_ == oldChild)
        {
            setLCurlyBracket((TLCurlyBracket) newChild);
            return;
        }

        for(ListIterator<PAccessCapability> i = this._accessCapability_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PAccessCapability) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._rCurlyBracket_ == oldChild)
        {
            setRCurlyBracket((TRCurlyBracket) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
