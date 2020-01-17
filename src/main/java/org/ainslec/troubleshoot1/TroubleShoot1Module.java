package org.ainslec.troubleshoot1;

import com.google.gwt.core.client.EntryPoint;

import jsinterop.annotations.JsMethod;

/**
 * 
 * @author Chris Ainsley
 *
 */
public class TroubleShoot1Module implements EntryPoint {

   @Override
   public void onModuleLoad() {
      // No initialization code required for this module
      // To be used via JsInterop only.
   }
   
   @JsMethod(namespace="troubleshoot1scope", name="troubleshoot1function")
   public static String troubleshoot1function() {
      return "Great Success !";
   }
}
