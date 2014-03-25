/*
 * This file is part of LinkJVM.
 *
 * Java Framework for the KIPR Link
 * Copyright (C) 2014 Markus Klein<m@mklein.co.at>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package linkjvm.low.factory;

import gnu.javax.crypto.cipher.WeakKeyException;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;

public abstract class AbstractMultiton<U, I>{
	private HashMap<U, WeakReference<I>> instances;
	
	/**
	 * 
	 */
	public AbstractMultiton(){
		instances = new HashMap<U, WeakReference<I>>();
	}
	
	/**
	 * 
	 * @param uniqueIdentifier
	 * @return
	 */
	public synchronized final I getInstance(U uniqueIdentifier){
		WeakReference<I> weakReference = instances.get(uniqueIdentifier);
		if(weakReference == null || weakReference.get() == null){
			if(weakReference != null){
				instances.remove(weakReference);
			}
			weakReference = new WeakReference<I>(getNewConcreteInstance(uniqueIdentifier));
			instances.put(uniqueIdentifier, weakReference);
		}
		return weakReference.get();
	}
	
	/**
	 * 
	 * @param uniqueIdentifier
	 * @return
	 */
	protected abstract I getNewConcreteInstance(U uniqueIdentifier);
}
