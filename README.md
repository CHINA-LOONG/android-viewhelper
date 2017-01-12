# android-viewhelper

Helper for honybomb methods. Supports Android 2.3 API 9 (GINGERBREAD) and up.

Usage:

    Step 1. Add the JitPack repository to your build file
    
    Add it in your root build.gradle at the end of repositories:
    
    allprojects {
		  repositories {
			  ...
			  maven { url 'https://jitpack.io' }
		  }
	}
    
    Step 2. Add the dependency
    
    dependencies {
	        compile 'com.github.robertapengelly:android-viewhelper:1.0.3'
	}

Usage:

    Import the ViewHelper
    
        import robertapengelly.support.view.ViewHelper;
    
    Access methods available from honycomb and up.
    
        ViewHelper.setTanslationY(view, 200f);
