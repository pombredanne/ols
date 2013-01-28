/*
 * OpenBench LogicSniffer / SUMP project 
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin St, Fifth Floor, Boston, MA 02110, USA
 *
 * 
 * Copyright (C) 2010-2011 - J.W. Janssen, http://www.lxtreme.nl
 */
package nl.lxtreme.ols.client.ui.action;


import javax.swing.*;


/**
 * Denotes an Swing {@link Action} that is managed by a framework as it is named
 * uniquely.
 */
public interface IManagedAction extends Action
{
  // METHODS

  /**
   * Returns the ID of this managed action.
   * 
   * @return an identifier of this managed action, never <code>null</code>.
   */
  String getId();

  /**
   * Called when this action needs to update its state.
   */
  void updateState();
}

/* EOF */