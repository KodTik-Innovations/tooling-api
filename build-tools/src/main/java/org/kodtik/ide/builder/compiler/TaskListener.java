package org.kodtik.ide.builder.compiler;

public interface TaskListener {
    void onStart(String message);

    void onConfigure(boolean isConfigured);    

    void onCancel();

    void onComplete(boolean success);
}
