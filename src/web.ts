import { WebPlugin } from '@capacitor/core';

import type { CubixRootPluginPlugin } from './definitions';

export class CubixRootPluginWeb
  extends WebPlugin
  implements CubixRootPluginPlugin
{
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }

  async testPluginMethod(options: { msg: string; }): Promise<{ value: string; }> {
      alert(options.msg);
      return { value: options.msg };
  }
}
