interface WebDriver
{
	public void close();
	public void get(String URL);
	public void refresh();
	
}

class RemotewebDriver implements WebDriver
{
  public void close()
  {
	  
  }
  public void get(String URL)
  {
	  
  }
  
  public void refresh()
  {
	  
  }
  
}

class chromeDriver extends RemotewebDriver
{
	public chromeDriver()
	{
		// code to open chrome
	}
	
	class FirefoxDriver extends RemotewebDriver
	{
		public FirefoxDriver()
		{
			// code to open firefox 
		}
	}
	
	FirefoxDriver f = new FirefoxDriver();
	
	//f.get("https://www.google.com");
	//f.refresh();
	//f.close();
}
