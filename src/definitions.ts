
declare module "@Capacitor/core" {
  interface PluginRegistry {
    CubixRootPlugin: CubixRootPluginPlugin;
  }
}

export interface CubixRootPluginPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
  testPluginMethod(options: { msg: string }): Promise<{ value: string }>;
}
