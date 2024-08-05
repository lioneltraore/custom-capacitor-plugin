import { registerPlugin } from '@capacitor/core';

import type { CubixRootPluginPlugin } from './definitions';

const CubixRootPlugin = registerPlugin<CubixRootPluginPlugin>(
  'CubixRootPlugin',
  {
    web: () => import('./web').then(m => new m.CubixRootPluginWeb()),
  },
);

export * from './definitions';
export { CubixRootPlugin };
