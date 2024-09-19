int zeros = 0;
		int ones = 0;
		int twos = 0;

		for (int i : a) {
			if (i == 0) {
				zeros++;
			} else if (i == 1) {
				ones++;
			} else {
				twos++;
			}
		}

		for (int i = 0; i < n; i++) {

			if (i < zeros) {
				a[i] = 0;
			} else if (i >= zeros && i < zeros + ones) {
				a[i] = 1;
			} else if (i >= zeros + ones && i < zeros + ones + twos) {
				a[i] = 2;
			}

		}

