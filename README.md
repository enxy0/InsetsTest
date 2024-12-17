Getting crash with androidx.fragment 1.8.5 and jetpack navigation on API < 30 when using androidx.core 1.16.0-alpha01

```
Process: com.github.enxy0.coordinatorlayoutinsets, PID: 15976
java.lang.NullPointerException: Parameter specified as non-null is null: method androidx.fragment.app.FragmentContainerView.setOnApplyWindowInsetsListener, parameter listener
	at androidx.fragment.app.FragmentContainerView.setOnApplyWindowInsetsListener(Unknown Source:2)
	at androidx.core.view.ViewGroupCompat.dispatchApplyWindowInsets(ViewGroupCompat.java:255)
	at androidx.core.view.ViewGroupCompat.dispatchApplyWindowInsets(ViewGroupCompat.java:264)
	at androidx.core.view.ViewGroupCompat.dispatchApplyWindowInsets(ViewGroupCompat.java:264)
	at androidx.core.view.ViewGroupCompat.dispatchApplyWindowInsets(ViewGroupCompat.java:264)
	at androidx.core.view.ViewGroupCompat.dispatchApplyWindowInsets(ViewGroupCompat.java:264)
	at androidx.core.view.ViewGroupCompat.dispatchApplyWindowInsets(ViewGroupCompat.java:264)
	at androidx.core.view.ViewGroupCompat.lambda$installCompatInsetsDispatch$0(ViewGroupCompat.java:218)
	at androidx.core.view.ViewGroupCompat$$ExternalSyntheticLambda1.onApplyWindowInsets(D8$$SyntheticClass:0)
	at android.view.View.dispatchApplyWindowInsets(View.java:10499)
	at android.view.ViewGroup.dispatchApplyWindowInsets(ViewGroup.java:7191)
	at android.view.ViewRootImpl.dispatchApplyInsets(ViewRootImpl.java:1925)
	at android.view.ViewRootImpl.performTraversals(ViewRootImpl.java:2030)
	at android.view.ViewRootImpl.doTraversal(ViewRootImpl.java:1721)
	at android.view.ViewRootImpl$TraversalRunnable.run(ViewRootImpl.java:7598)
	at android.view.Choreographer$CallbackRecord.run(Choreographer.java:966)
	at android.view.Choreographer.doCallbacks(Choreographer.java:790)
	at android.view.Choreographer.doFrame(Choreographer.java:725)
	at android.view.Choreographer$FrameDisplayEventReceiver.run(Choreographer.java:951)
	at android.os.Handler.handleCallback(Handler.java:883)
	at android.os.Handler.dispatchMessage(Handler.java:100)
	at android.os.Looper.loop(Looper.java:214)
	at android.app.ActivityThread.main(ActivityThread.java:7356)
	at java.lang.reflect.Method.invoke(Native Method)
	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:492)
	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:930)
```
