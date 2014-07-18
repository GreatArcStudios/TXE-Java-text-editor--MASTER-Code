<head><link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>
<style>

</style>
</head>

<h1><b>STATUS:</b></h1><h2>Working and new nightly builds coming!</h2>


![TXE](http://i.imgur.com/MZkzkJh.png "TXE")

<span style = 'Open Sans'> TXE-MASTER-Code Resopsitory </span> 
===============

Watch the TXE development happen, with new code updated frequently and with a nightly build!

Social Media

<div class="button-group">
  <button class="button-outline" type="button" href="http://greatarkstudios.weebly.com">Our amazing website </button>
  <button class="button-outline" type="button"><a href="http://twitter.com/garcstudios">Our Twitter</a></button>
  </button>
</div>
===========
<h2>Overview</h2>
<p>TXE is a open source, fully Java based word processor. <b>Now with a programmer's text pad!</b></p>
<p>Featuring a fully functional font chooser, color chooser, file manager, write, read, find and highlight text, print, insert date, select all, calculator, and encryption mini app.</p>

=
<P>Our main website is at http://greatarkstudios.weebly.com </p>
========
<h3>Notable Places and Code areas</h3>
<ul>
<li>The first frame is titled accept.java</li>
<li>The main program (TXE) is in TXE.java</li>
<li>The encryption app is in the java file: Encrypt.java</li>
<li>The calculator apps is in the java file: Calculator.java</li>
<li>The sketch pad is in the java file: Drawing.java </li>
<li>The setting is in the java file: Setting.java </li>
<li>The about frame is in the java file: about.java</li>
</ul>
=
<H4><b>Notable spots in the main program(TXE)</b></h4>


<H5>Starting at line 156 and ending at line 158 it will say:</h5>

```java
	 // DO NOT CHANGE
       JSplitPane splitpane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
			new JScrollPane(tree), scroll);

```
<H5>Do not change it if you want the split pane.</h5>
=
```java
              //variable declarations 
	      UndoManager undoManager = null;
	      DefaultStyledDocument document;
              StyleContext styleContext;


174|		undoManager = new UndoManager();
175|
176|		styleContext = new StyleContext();
177|
178|          document = new DefaultStyledDocument(styleContext);
179|
180|		TXEAREA.setDocument(document);
```
<H5>Don't change the order if your want the undo and redo to work, as it seemed to fix a undo and redo not working bug.</h5>
=
<h5>At line 184:</h5>
```java 
184|		this.setLocationRelativeTo(null);
```
<h5>Neat trick for getting the frame in the center of the screen.</h5>
=
<H4>TXE Programmers Text Pad Notable Areas</h4>
=
<h5>At line 683-685 it will say:</h5>
```java
683|		// edit.add(undo);
684|		// edit.add(redo);
685|		// edit.addSeparator();
```
<h5>Undo and Redo is build into RSyntaxTextArea so the custom build Undo and Redo is obsolete</h5>
=====
<h3>Instructions for finding the Nightly Build</h3>
<ol>
<li>Download the Zip or Tar of TXE project, the file is about 100mbs.</li>
<li>The .zip or .tar will now be in your downloads folder unless other wise specified, under the name: "GreatArkStudios-TXE-MASTER-Code-xxxxxx"</li>
<li>Use your favorite unarchiver, The Unarchiver on mac would do fine, Win Rar on Windows would also do fine.</li>
<li>Now open the unarchived folder and open the TXE folder.</li>
<li>You will see a bunch of random stuff, such as code, images, and lots of other development items, if you are not a developer don't worry about this.</li>
<li>Near the bottom of the folder, you will see a file/.jar, this is the app. It is named "TXE Nightly Build Java 7.jar".</li> 
<li>Open it if you have <b>java 7</b>, if not go to Java 7 Website.</li>
<li>Follow the steps and then reopen it, and volia! You can use TXE!
</ol>
=


<b><a href= "http://eclipse.org">Eclipse</a> instructions</b>


1.Create new workspace, preferably named: TXE Forked


2.Make a new project named TXE 


3.Drag all of the files that you have downloaded from GitHub and Dropbox 
into the project folder, from either finder or Windows explorer.


4.Download the Swing Layout Extentions 


5.Download the bouncy castle jar for the encryption file from http://www.bouncycastle.org/latest_releases.html 


6.Right click on project in the explorer and click on configure build path
7.Add the jar downloaded from http://www.bouncycastle.org/latest_releases.html as an EXTERNAL JAR


8.Debug and run it should work


9.Create your versions of TXE 


<p>10.Please share or report your versions of TXE to the community.<p>


<hr></hr>


<b><a href="https://netbeans.org">NetBeans</a> instructions</b>




1.Create new workspace, preferably named: TXE Forked.




2.Make a new project named TXE




3.Drag all of the files that you have downloaded from GitHub and Dropbox 
into the project folder, from either finder or Windows Explorer.




4.Download the bouncy castle jar for the encryption file from http://www.bouncycastle.org/latest_releases.html 




5.Right click on project in the explorer and click on configure build path




6.Add the jar downloaded from http://www.bouncycastle.org/latest_releases.html as an EXTERNAL JAR




7.Debug and run it should work



8.Create your versions of TXE 



<p>9.Please share or report your versions of TXE to the community.</p>

