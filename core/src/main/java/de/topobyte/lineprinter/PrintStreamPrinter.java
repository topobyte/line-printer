// Copyright 2017 Sebastian Kuerten
//
// This file is part of line-printer.
//
// line-printer is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// line-printer is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with line-printer. If not, see <http://www.gnu.org/licenses/>.

package de.topobyte.lineprinter;

import java.io.PrintStream;

public class PrintStreamPrinter implements LinePrinter
{

	private PrintStream stream;

	public PrintStreamPrinter(PrintStream stream)
	{
		this.stream = stream;
	}

	@Override
	public void println(String line)
	{
		stream.println(line);
	}

}
