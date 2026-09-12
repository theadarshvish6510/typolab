const { contextBridge, ipcRenderer } = require('electron');

// Expose safe desktop platform indicators to the React app
contextBridge.exposeInMainWorld('desktopAPI', {
  isDesktop: true,
  platform: process.platform,
  version: '3.0.0'
});
