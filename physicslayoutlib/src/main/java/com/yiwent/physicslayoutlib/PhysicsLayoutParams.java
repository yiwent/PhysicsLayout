package com.yiwent.physicslayoutlib;

/**
 * Signifies that the LayoutParams are able to provide a PhysicsConfig. You still need to create a
 * {@link android.view.ViewGroup.LayoutParams} implementation using the appropriate subclass, and
 * making use of {@link PhysicsLayoutParamsProcessor}. See {@link PhysicsFrameLayout} for an example
 */
public interface PhysicsLayoutParams {
    PhysicsConfig getConfig();
}
