const config = {
  appId: 'com.adarsh.typolab',
  appName: 'TypoLab Studio',
  webDir: 'dist',
  backgroundColor: '#090D16',
  server: {
    androidScheme: 'https'
  },
  android: {
    backgroundColor: '#090D16',
    allowMixedContent: true,
    captureInput: true
  },
  plugins: {
    SplashScreen: {
      launchShowDuration: 1500,
      backgroundColor: '#090D16',
      androidSplashResourceName: 'splash',
      showSpinner: false
    }
  }
};

export default config;
