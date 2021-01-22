# Developing-Apps-With-Kotlin
Small PoC apps developed while following Google's [Developing Android Apps with Kotlin](https://classroom.udacity.com/courses/ud9012), as part of my development path to learning Kotlin.

Notes:

![Android Lifecycle Image](https://developer.android.com/guide/components/images/activity_lifecycle.png)

| Lifecycle Method  | State | called when the Activity |
| ------------- | ------------- | ---------------------|
| onCreate() | CREATED | Is first launched (or when it's process is killed, and is re-created from scratch). Layout inflations, one time initializations. |
| onStart()  | STARTED | Becomes visible / in the foreground. | 
| onResume()  | RESUMED | Gains focus. Therefore you can interact with it. | 
| onPause()  | PAUSED | Loses focus  e.g.  when a Dialog pops up or, for devices like Surface Duo with 2 screens, you can have 2 apps open on separate panes but only one can have focus. | 
| onStop()  | STOPPED | Goes off screen / in the background. | 
| onDestroy()  | DESTROYED | Mirror of onCreate. Final teardown. | 
| - | - | -
| onRestart() | - | Activity was already CREATED, so this will be called instead of onCreate() |








