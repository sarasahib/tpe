package crc64ab9388aeca080b5c;


public class AutoStartWorker
	extends androidx.work.Worker
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_doWork:()Landroidx/work/ListenableWorker$Result;:GetDoWorkHandler\n" +
			"";
		mono.android.Runtime.register ("AutoStartApp.Platforms.Android.AutoStartWorker, MauiApp1ATM", AutoStartWorker.class, __md_methods);
	}


	public AutoStartWorker (android.content.Context p0, androidx.work.WorkerParameters p1)
	{
		super (p0, p1);
		if (getClass () == AutoStartWorker.class) {
			mono.android.TypeManager.Activate ("AutoStartApp.Platforms.Android.AutoStartWorker, MauiApp1ATM", "Android.Content.Context, Mono.Android:AndroidX.Work.WorkerParameters, Xamarin.AndroidX.Work.Runtime", this, new java.lang.Object[] { p0, p1 });
		}
	}


	public androidx.work.ListenableWorker.Result doWork ()
	{
		return n_doWork ();
	}

	private native androidx.work.ListenableWorker.Result n_doWork ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
