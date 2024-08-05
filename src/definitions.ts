export interface CubixRootPluginPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
