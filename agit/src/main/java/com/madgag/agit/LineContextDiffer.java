import static org.eclipse.jgit.diff.RawTextComparator.DEFAULT;
	private int bigFileThreshold = 1 * 1024 * 1024;
				RawText a = new RawText(aRaw);
				RawText b = new RawText(bRaw);
				return formatEdits(a, b, MyersDiff.INSTANCE.diff(DEFAULT, a, b));