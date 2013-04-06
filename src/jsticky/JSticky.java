/**
*    Copyright (c) 2013 Abhishek Banerjee.
*    This file is part of JSticky.
*
*    JSticky is free software: you can redistribute it and/or modify
*    it under the terms of the GNU General Public License as published by
*    the Free Software Foundation, either version 3 of the License, or
*    (at your option) any later version.
*
*    JSticky is distributed in the hope that it will be useful,
*    but WITHOUT ANY WARRANTY; without even the implied warranty of
*    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*    GNU General Public License for more details.
*
*    You should have received a copy of the GNU General Public License
*    along with JSticky.  If not, see <http://www.gnu.org/licenses/>.
*
*/
package jsticky;

import javax.swing.SwingUtilities;

/**
 *
 * @author Abhishek
 */
public class JSticky {

    //private static ArrayList<StickyFrame> st;

    public JSticky() {
        //st = new ArrayList<StickyFrame>();
        
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new StickyFrame();
            }
        
        });
    }
}
