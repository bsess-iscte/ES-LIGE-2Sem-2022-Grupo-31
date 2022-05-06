package org.jfree.chart;



import javax.swing.event.EventListenerList;
import org.jfree.chart.event.ChartChangeListener;
import org.jfree.chart.internal.Args;
import java.io.Serializable;

	
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.Paint;
import org.jfree.chart.api.RectangleInsets;
import org.jfree.chart.title.TextTitle;
import java.awt.Image;
import org.jfree.chart.api.RectangleAlignment;
import javax.swing.event.EventListenerList;
import org.jfree.chart.internal.Args;
import org.jfree.chart.event.ChartChangeEvent;
import org.jfree.chart.event.ChartChangeListener;
import org.jfree.chart.legend.LegendTitle;
import org.jfree.chart.title.Title;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * Classe criada a partir da refabricação de God Class na classe org.jfree.chart.JFreeChart.
 *
 * @author Bárbara
 */
public class JFreeChartProduct implements Serializable, Cloneable {

private JFreeChartProductProduct jFreeChartProductProduct = new JFreeChartProductProduct();
	private transient RenderingHints renderingHints;
	private boolean borderVisible;
	private transient Stroke borderStroke;
	private transient Paint borderPaint;
	private RectangleInsets padding;
	private TextTitle title;
	private transient Paint backgroundPaint;
	private transient Image backgroundImage;
	private RectangleAlignment backgroundImageAlignment = RectangleAlignment.FILL;
	private float backgroundImageAlpha = 0.5f;
	private transient EventListenerList changeListeners;
	
	/**
     * Returns the collection of rendering hints for the chart.
     *
     * @return The rendering hints for the chart (never {@code null}).
     */
	public RenderingHints getRenderingHints() {
		return renderingHints;
	}

	/**
     * Sets the rendering hints for the chart.
     *
     * @param renderingHints  the rendering hints ({@code null} not permitted).
     */
	public void setRenderingHints2(RenderingHints renderingHints) {
		this.renderingHints = renderingHints;
	}

	 /**
     * Returns a flag that controls whether or not a border is drawn around the
     * outside of the chart.
     *
     * @return A boolean.
     */
	public boolean getBorderVisible() {
		return borderVisible;
	}

	/**
     * Sets a flag that controls whether or not a border is drawn around the
     * outside of the chart.
     *
     * @param visible  the flag.
     */
	public void setBorderVisible2(boolean borderVisible) {
		this.borderVisible = borderVisible;
	}

	 /**
     * Returns the stroke used to draw the chart border (if visible).
     *
     * @return The border stroke.
     */
	public Stroke getBorderStroke() {
		return borderStroke;
	}

	/**
     * Sets the stroke used to draw the chart border (if visible).
     *
     * @param stroke  the stroke.
     */
	public void setBorderStroke2(Stroke borderStroke) {
		this.borderStroke = borderStroke;
	}

	 /**
     * Returns the paint used to draw the chart border (if visible).
     *
     * @return The border paint.
     */
	public Paint getBorderPaint() {
		return borderPaint;
	}

	/**
     * Sets the paint used to draw the chart border (if visible).
     *
     * @param paint  the paint.
     */
	public void setBorderPaint2(Paint borderPaint) {
		this.borderPaint = borderPaint;
	}

	/**
     * Returns the padding between the chart border and the chart drawing area.
     *
     * @return The padding (never {@code null}).
     */
	public RectangleInsets getPadding() {
		return padding;
	}

	 /**
     * Sets the padding between the chart border and the chart drawing area,
     * and sends a {@link ChartChangeEvent} to all registered listeners.
     *
     * @param padding  the padding ({@code null} not permitted).
     */
	public void setPadding2(RectangleInsets padding) {
		this.padding = padding;
	}

	/**
     * Returns the main chart title.  Very often a chart will have just one
     * title, so we make this case simple by providing accessor methods for
     * the main title.  However, multiple titles are supported - see the
     * {@link #addSubtitle(Title)} method.
     *
     * @return The chart title (possibly {@code null}).
     */
	public TextTitle getTitle() {
		return title;
	}

	/**
     * Sets the main title for the chart and sends a {@link ChartChangeEvent}
     * to all registered listeners. 
     *
     * @param title  the title ({@code null} permitted).
     */
	public void setTitle2(TextTitle title) {
		this.title = title;
	}

	/**
     * Returns the paint used for the chart background.
     *
     * @return The paint (possibly {@code null}).
     */
	public Paint getBackgroundPaint() {
		return backgroundPaint;
	}

	 /**
     * Sets the paint used to fill the chart background and sends a
     * {@link ChartChangeEvent} to all registered listeners.
     *
     * @param paint  the paint ({@code null} permitted).
     */
	public void setBackgroundPaint2(Paint backgroundPaint) {
		this.backgroundPaint = backgroundPaint;
	}

	/**
     * Returns the background image for the chart, or {@code null} if
     * there is no image.
     *
     * @return The image (possibly {@code null}).
     */
	public Image getBackgroundImage() {
		return backgroundImage;
	}

	/**
     * Sets the background image for the chart and sends a
     * {@link ChartChangeEvent} to all registered listeners.
     *
     * @param image  the image ({@code null} permitted).
     */
	public void setBackgroundImage2(Image backgroundImage) {
		this.backgroundImage = backgroundImage;
	}

	/**
     * Returns the background image alignment. 
     *
     * @return The alignment (never {@code null}).
     */
	public RectangleAlignment getBackgroundImageAlignment() {
		return backgroundImageAlignment;
	}

	/**
     * Sets the background alignment and sends a change notification to all
     * registered listeners.
     *
     * @param alignment  the alignment ({@code null} not permitted).
     */
	public void setBackgroundImageAlignment2(RectangleAlignment backgroundImageAlignment) {
		this.backgroundImageAlignment = backgroundImageAlignment;
	}

	/**
     * Returns the alpha-transparency for the chart's background image.
     *
     * @return The alpha-transparency.
     */
	public float getBackgroundImageAlpha() {
		return backgroundImageAlpha;
	}

	/**
     * Sets the alpha-transparency for the chart's background image.
     * Registered listeners are notified that the chart has been changed.
     *
     * @param alpha  the alpha value.
     */
	public void setBackgroundImageAlpha2(float backgroundImageAlpha) {
		this.backgroundImageAlpha = backgroundImageAlpha;
	}

	/**
	 * Sets the changeListeners for the JFreeChartProduct.
	 * 
	 * @param changeListeners
	 */
	public void setChangeListeners(EventListenerList changeListeners) {
		this.changeListeners = changeListeners;
	}

	/**
	 * Returns the notification.
	 * 
	 * @return		A notification.
	 */
	public boolean getNotify() {
		return jFreeChartProductProduct.getNotify();
	}

	/**
	* Sets a flag that controls whether or not listeners receive  {@link ChartChangeEvent}   notifications.
	* @param notify    a boolean.
	*/
	public void setNotify2(boolean notify) {
		jFreeChartProductProduct.setNotify2(notify);
	}

	/**
	* Sets a flag that controls whether or not a border is drawn around the outside of the chart.
	* @param visible   the flag.
	* @see #isBorderVisible()
	*/
	public void setBorderVisible(boolean visible, JFreeChart jFreeChart) {
		this.borderVisible = visible;
		fireChartChanged(jFreeChart);
	}

	/**
	* Sets the padding between the chart border and the chart drawing area, and sends a  {@link ChartChangeEvent}  to all registered listeners.
	* @param padding   the padding ( {@code  null}  not permitted).
	* @see #getPadding()
	*/
	public void setPadding(RectangleInsets padding, JFreeChart jFreeChart) {
		Args.nullNotPermitted(padding, "padding");
		this.padding = padding;
		jFreeChartProductProduct.notifyListeners(new ChartChangeEvent(jFreeChart), this.changeListeners);
	}

	/**
	* Sets the background image for the chart and sends a {@link ChartChangeEvent}  to all registered listeners.
	* @param image   the image ( {@code  null}  permitted).
	* @see #getBackgroundImage()
	*/
	public void setBackgroundImage(Image image, JFreeChart jFreeChart) {
		if (this.backgroundImage != null) {
			if (!this.backgroundImage.equals(image)) {
				this.backgroundImage = image;
				fireChartChanged(jFreeChart);
			}
		} else {
			if (image != null) {
				this.backgroundImage = image;
				fireChartChanged(jFreeChart);
			}
		}
	}

	/**
	* Sets the background alignment and sends a change notification to all registered listeners.
	* @param alignment   the alignment ( {@code  null}  not permitted).
	* @see #getBackgroundImageAlignment()
	*/
	public void setBackgroundImageAlignment(RectangleAlignment alignment, JFreeChart jFreeChart) {
		Args.nullNotPermitted(alignment, "alignment");
		if (this.backgroundImageAlignment != alignment) {
			this.backgroundImageAlignment = alignment;
			fireChartChanged(jFreeChart);
		}
	}

	/**
	* Sets the alpha-transparency for the chart's background image. Registered listeners are notified that the chart has been changed.
	* @param alpha   the alpha value.
	* @see #getBackgroundImageAlpha()
	*/
	public void setBackgroundImageAlpha(float alpha, JFreeChart jFreeChart) {
		if (this.backgroundImageAlpha != alpha) {
			this.backgroundImageAlpha = alpha;
			fireChartChanged(jFreeChart);
		}
	}

	/**
	* Sets a flag that controls whether or not listeners receive {@link ChartChangeEvent}  notifications.
	* @param notify   a boolean.
	* @see #isNotify()
	*/
	public void setNotify(boolean notify, JFreeChart jFreeChart) {
		jFreeChartProductProduct.setNotify(notify, jFreeChart, this.changeListeners);
	}

	/**
	* Sends a  {@link ChartChangeEvent}  to all registered listeners.
	* @param event   information about the event that triggered the notification.
	*/
	public void notifyListeners(ChartChangeEvent event) {
		jFreeChartProductProduct.notifyListeners(event, this.changeListeners);
	}


	/**
	* Registers an object for notification of changes to the chart.
	* @param listener   the listener ( {@code  null}  not permitted).
	* @see #removeChangeListener(ChartChangeListener)
	*/
	public void addChangeListener(ChartChangeListener listener) {
		Args.nullNotPermitted(listener, "listener");
		this.changeListeners.add(ChartChangeListener.class, listener);
	}

	/**
	* Deregisters an object for notification of changes to the chart.
	* @param listener   the listener ( {@code  null}  not permitted)
	* @see #addChangeListener(ChartChangeListener)
	*/
	public void removeChangeListener(ChartChangeListener listener) {
		Args.nullNotPermitted(listener, "listener");
		this.changeListeners.remove(ChartChangeListener.class, listener);
	}

	/**
	* Sets the stroke used to draw the chart border (if visible).
	* @param stroke   the stroke.
	* @see #getBorderStroke()
	*/
	public void setBorderStroke(Stroke stroke, JFreeChart jFreeChart) {
		this.borderStroke = stroke;
		fireChartChanged(jFreeChart);
	}

	/**
	* Sets the paint used to draw the chart border (if visible).
	* @param paint   the paint.
	* @see #getBorderPaint()
	*/
	public void setBorderPaint(Paint paint, JFreeChart jFreeChart) {
		this.borderPaint = paint;
		fireChartChanged(jFreeChart);
	}

	/**
	* Sets the paint used to fill the chart background and sends a {@link ChartChangeEvent}  to all registered listeners.
	* @param paint   the paint ( {@code  null}  permitted).
	* @see #getBackgroundPaint()
	*/
	public void setBackgroundPaint(Paint paint, JFreeChart jFreeChart) {
		if (this.backgroundPaint != null) {
			if (!this.backgroundPaint.equals(paint)) {
				this.backgroundPaint = paint;
				fireChartChanged(jFreeChart);
			}
		} else {
			if (paint != null) {
				this.backgroundPaint = paint;
				fireChartChanged(jFreeChart);
			}
		}
	}

	/**
	* Sends a default  {@link ChartChangeEvent}  to all registered listeners. <P> This method is for convenience only.
	*/
	public void fireChartChanged(JFreeChart jFreeChart) {
		ChartChangeEvent event = new ChartChangeEvent(jFreeChart);
		jFreeChartProductProduct.notifyListeners(event, this.changeListeners);
	}

	/**
	* Sets the rendering hints for the chart.  These will be added (using the {@code  Graphics2D.addRenderingHints()}  method) near the start of the {@code  JFreeChart.draw()}  method.
	* @param renderingHints   the rendering hints ( {@code  null}  not permitted).
	* @see #getRenderingHints()
	*/
	public void setRenderingHints(RenderingHints renderingHints, JFreeChart jFreeChart) {
		Args.nullNotPermitted(renderingHints, "renderingHints");
		this.renderingHints = renderingHints;
		fireChartChanged(jFreeChart);
	}

	/**
	* Sets a flag that indicates whether or not anti-aliasing is used when the chart is drawn. <P> Anti-aliasing usually improves the appearance of charts, but is slower.
	* @param flag   the new value of the flag.
	* @see #getAntiAlias()
	*/
	public void setAntiAlias(boolean flag, JFreeChart jFreeChart) {
		Object hint = flag ? RenderingHints.VALUE_ANTIALIAS_ON : RenderingHints.VALUE_ANTIALIAS_OFF;
		this.renderingHints.put(RenderingHints.KEY_ANTIALIASING, hint);
		fireChartChanged(jFreeChart);
	}

	/**
	* Returns a flag that indicates whether or not anti-aliasing is used when the chart is drawn.
	* @return  The flag.
	* @see #setAntiAlias(boolean)
	*/
	public boolean getAntiAlias() {
		Object val = this.renderingHints.get(RenderingHints.KEY_ANTIALIASING);
		return RenderingHints.VALUE_ANTIALIAS_ON.equals(val);
	}

	/**
	* Returns the current value stored in the rendering hints table for {@link RenderingHints#KEY_TEXT_ANTIALIASING} .
	* @return  The hint value (possibly  {@code  null} ).
	* @see #setTextAntiAlias(Object)
	*/
	public Object getTextAntiAlias() {
		return this.renderingHints.get(RenderingHints.KEY_TEXT_ANTIALIASING);
	}

	/**
	* Sets the value in the rendering hints table for {@link RenderingHints#KEY_TEXT_ANTIALIASING}  and sends a {@link ChartChangeEvent}  to all registered listeners.
	* @param val   the new value ( {@code  null}  permitted).
	* @see #getTextAntiAlias()
	* @see #setTextAntiAlias(boolean)
	*/
	public void setTextAntiAlias(Object val, JFreeChart jFreeChart) {
		this.renderingHints.put(RenderingHints.KEY_TEXT_ANTIALIASING, val);
		jFreeChartProductProduct.notifyListeners(new ChartChangeEvent(jFreeChart), this.changeListeners);
	}

	/**
	* Sets the value in the rendering hints table for {@link RenderingHints#KEY_TEXT_ANTIALIASING}  to either {@link RenderingHints#VALUE_TEXT_ANTIALIAS_ON}  or {@link RenderingHints#VALUE_TEXT_ANTIALIAS_OFF} , then sends a {@link ChartChangeEvent}  to all registered listeners.
	* @param flag   the new value of the flag.
	* @see #getTextAntiAlias()
	* @see #setTextAntiAlias(Object)
	*/
	public void setTextAntiAlias(boolean flag, JFreeChart jFreeChart) {
		if (flag) {
			setTextAntiAlias(RenderingHints.VALUE_TEXT_ANTIALIAS_ON, jFreeChart);
		} else {
			setTextAntiAlias(RenderingHints.VALUE_TEXT_ANTIALIAS_OFF, jFreeChart);
		}
	}

	/**
	* Sets the main title for the chart and sends a  {@link ChartChangeEvent} to all registered listeners.  If you do not want a title for the chart, set it to  {@code  null} .  If you want more than one title on a chart, use the  {@link #addSubtitle(Title)}  method.
	* @param title   the title ( {@code  null}  permitted).
	* @see #getTitle()
	*/
	public void setTitle(TextTitle title, JFreeChart jFreeChart) {
		if (this.title != null) {
			this.title.removeChangeListener(jFreeChart);
		}
		this.title = title;
		if (title != null) {
			title.addChangeListener(jFreeChart);
		}
		fireChartChanged(jFreeChart);
	}

	/**
	* Sets the chart title and sends a  {@link ChartChangeEvent}  to all registered listeners.  This is a convenience method that ends up calling the  {@link #setTitle(TextTitle)}  method.  If there is an existing title, its text is updated, otherwise a new title using the default font is added to the chart.  If  {@code  text}  is  {@code  null}  the chart title is set to  {@code  null} .
	* @param text   the title text ( {@code  null}  permitted).
	* @see #getTitle()
	*/
	public void setTitle(String text, JFreeChart jFreeChart) {
		if (text != null) {
			if (this.title == null) {
				setTitle(new TextTitle(text, JFreeChart.DEFAULT_TITLE_FONT), jFreeChart);
			} else {
				this.title.setText(text);
			}
		} else {
			setTitle((TextTitle) null, jFreeChart);
		}
	}

	/**
	* Returns the nth legend for a chart, or  {@code  null} .
	* @param index   the legend index (zero-based).
	* @return  The legend (possibly  {@code  null} ).
	* @see #addLegend(LegendTitle)
	*/
	public LegendTitle getLegend(int index, List<Title> thisSubtitles) {
		int seen = 0;
		for (Title subtitle : thisSubtitles) {
			if (subtitle instanceof LegendTitle) {
				if (seen == index) {
					return (LegendTitle) subtitle;
				} else {
					seen++;
				}
			}
		}
		return null;
	}

	/**
	* Returns a new list containing all the subtitles for the chart.
	* @return  The subtitle list (possibly empty, but never  {@code  null} ).
	* @see #setSubtitles(List)
	*/
	public List<Title> getSubtitles(List<Title> thisSubtitles) {
		return new ArrayList<>(thisSubtitles);
	}

	/**
	* Returns the number of titles for the chart.
	* @return  The number of titles for the chart.
	* @see #getSubtitles()
	*/
	public int getSubtitleCount(List<Title> thisSubtitles) {
		return thisSubtitles.size();
	}

	/**
	* Returns a chart subtitle.
	* @param index   the index of the chart subtitle (zero based).
	* @return  A chart subtitle.
	* @see #addSubtitle(Title)
	*/
	public Title getSubtitle(int index, List<Title> thisSubtitles) {
		if ((index < 0) || (index >= getSubtitleCount(thisSubtitles))) {
			throw new IllegalArgumentException("Index out of range.");
		}
		return thisSubtitles.get(index);
	}

	/**
	* Adds a chart subtitle, and notifies registered listeners that the chart has been modified.
	* @param subtitle   the subtitle ( {@code  null}  not permitted).
	* @see #getSubtitle(int)
	*/
	public void addSubtitle(Title subtitle, List<Title> thisSubtitles, JFreeChart jFreeChart) {
		Args.nullNotPermitted(subtitle, "subtitle");
		thisSubtitles.add(subtitle);
		subtitle.addChangeListener(jFreeChart);
		fireChartChanged(jFreeChart);
	}

	/**
	* Adds a subtitle at a particular position in the subtitle list, and sends a  {@link ChartChangeEvent}  to all registered listeners.
	* @param index   the index (in the range 0 to  {@link #getSubtitleCount()} ).
	* @param subtitle   the subtitle to add ( {@code  null}  not permitted).
	*/
	public void addSubtitle(int index, Title subtitle, List<Title> thisSubtitles, JFreeChart jFreeChart) {
		Args.requireInRange(index, "index", 0, getSubtitleCount(thisSubtitles));
		Args.nullNotPermitted(subtitle, "subtitle");
		thisSubtitles.add(index, subtitle);
		subtitle.addChangeListener(jFreeChart);
		fireChartChanged(jFreeChart);
	}

	/**
	* Removes the specified subtitle and sends a  {@link ChartChangeEvent}  to all registered listeners.
	* @param title   the title.
	* @see #addSubtitle(Title)
	*/
	public void removeSubtitle(Title title, List<Title> thisSubtitles, JFreeChart jFreeChart) {
		thisSubtitles.remove(title);
		fireChartChanged(jFreeChart);
	}

	/**
	* Clears all subtitles from the chart and sends a  {@link ChartChangeEvent} to all registered listeners.
	* @see #addSubtitle(Title)
	*/
	public void clearSubtitles(List<Title> thisSubtitles, JFreeChart jFreeChart) {
		for (Title t : thisSubtitles) {
			t.removeChangeListener(jFreeChart);
		}
		thisSubtitles.clear();
		fireChartChanged(jFreeChart);
	}


	/**
     * Clones the object, and takes care of listeners.
     *
     * @return A clone.
     */
	public Object clone() throws CloneNotSupportedException {
		return (JFreeChartProduct) super.clone();
	}
}